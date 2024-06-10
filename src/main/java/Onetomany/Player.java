package Onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Player {
	@Id
	int playerid;
	String playername;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "playerid")
	List<Skills> plyr;
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", plyr=" + plyr + "]";
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public List<Skills> getPlyr() {
		return plyr;
	}
	public void setPlyr(List<Skills> plyr) {
		this.plyr = plyr;
	}
	public Player(int playerid, String playername) {
		super();
		this.playerid = playerid;
		this.playername = playername;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
}
