package asia.ienter.hcapp.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by phamquangmanh on 9/13/16.
 */

public class UserView {
    @SerializedName("MaNSD")
    private String Id;

    @SerializedName("Name")
    private String Name;

    @SerializedName("TaiKhoan")
    private String UserName;

    @SerializedName("MaNV")
    private String IdPesonal;

    @SerializedName("MaQH")
    private String Permisstion;

    @SerializedName("Token")
    private String UserToken;

    public UserView(String id, String name, String userName, String idPesonal, String permisstion, String userToken) {
        Id = id;
        Name = name;
        UserName = userName;
        IdPesonal = idPesonal;
        Permisstion = permisstion;
        UserToken = userToken;
    }
   
    public String getUserToken() {
        return UserToken;
    }

    public void setUserToken(String userToken) {
        UserToken = userToken;
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

    public String getIdPesonal() {
        return IdPesonal;
    }

    public void setIdPesonal(String idPesonal) {
        IdPesonal = idPesonal;
    }

    public String getPermisstion() {
        return Permisstion;
    }

    public void setPermisstion(String permisstion) {
        Permisstion = permisstion;
    }
}
