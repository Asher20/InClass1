
public class CompareLastFirstName implements Comparator<Student> {

	public int compare(Student first, Student last) {
		String firstName = first.getFirstName();
		String lastName = first.getLastName();
		String firstNameLast = last.getFirstName();
		String lastNameLast = last.getLastName();

		if (first.getFirstName().compareTo(last).getFirstName() < 0) {
			return -1;
		} 
		else if (firstName.compareTo(firstNameLast) == 0) {
			if(lastName.compareTo(lastNameLast) < 0) {
				return -1;
			}
			else if (lastName.compareTo(lastNameLast) == 0) {
				return 0;
			}
			else {
				return -1;
			}
		}
		else {
			return 1;
		}
	}

}
