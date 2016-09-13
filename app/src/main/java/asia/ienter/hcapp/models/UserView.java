package asia.ienter.hcapp.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by phamquangmanh on 9/13/16.
 */

public class UserView {

    @SerializedName("Id")
    private String Id;

    @SerializedName("Name")
    private String Name;

    @SerializedName("UserName")
    private String UserName;

    @SerializedName("IdPesonal")
    private String IdPesonal;

    public UserView(String id, String name, String userName, String idPesonal) {
        Id = id;
        Name = name;
        UserName = userName;
        IdPesonal = idPesonal;
    }

    public String getIdPesonal() {
        return IdPesonal;
    }

    public void setIdPesonal(String idPesonal) {
        IdPesonal = idPesonal;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
