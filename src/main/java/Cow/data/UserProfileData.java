package cow.data;

import cow.dao.UserProfileDAO;

/**
 * Created by steve on 10/17/15.
 */
public class UserProfileData extends AWSDatabase {
       public UserProfileDAO getUserData(UserProfileDAO user){
           return getMapper().load(UserProfileDAO.class, user.getUsername());
       }
}
