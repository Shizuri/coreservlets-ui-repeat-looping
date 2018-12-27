package looping;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="colors")
public class ColorsController {

	private String[] colors = new String[] {"red", "green", "blue", "yellow", "magenta"};
	private List<Name> friends = new ArrayList<Name>();
	
	public ColorsController() {
		friends.add(new Name("Zdravko", "Mavkov"));
		friends.add(new Name("Pero", "Stankov"));
		friends.add(new Name("Mitko", "Roshich"));
	}

	public List<Name> getFriends() {
		return friends;
	}

	public void setFriends(List<Name> friends) {
		this.friends = friends;
	}

	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}
}
