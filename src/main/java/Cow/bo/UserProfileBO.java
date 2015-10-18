package cow.bo;

import cow.dao.UserProfileDAO;
import cow.data.UserProfileData;

/**
 * Created by steve on 10/17/15.
 */
public class UserProfileBO {

    UserProfileData userProfileData;

    public UserProfileBO() {
        userProfileData = new UserProfileData();
    }

    public UserProfileDAO getUserProfileData(String username){
        UserProfileDAO temp = new UserProfileDAO();

        temp.setUsername(username);
        return userProfileData.getUserData(temp);
    }
}
