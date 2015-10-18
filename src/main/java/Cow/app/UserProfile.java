package cow.app;

import cow.bo.UserProfileBO;
import cow.dao.UserProfileDAO;

/**
 * Created by steve on 10/17/15.
 */
public class UserProfile {

    UserProfileBO userProfileBO;

    public UserProfile() {
        userProfileBO = new UserProfileBO();
    }

    public UserProfileDAO getUserProfile(String username){

        return userProfileBO.getUserProfileData(username);
    }



}
