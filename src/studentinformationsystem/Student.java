package studentinformationsystem;

public class Student {
    private String id;
    private String StudentNumber;
    private String NationalId;
    private String Name;
    private String Surname;
    private String BirthDate;
    private Gender gender;
    private String email;
    private String PhoneNumbers;
    private String Address;
    private String ProgramId;
    private short EnrollmentYear;
    private short ClassYear;
    private String PhotoUrl;
    private String CreatedAt;
    
public Student() {
}
public Student(String id, String studentNumber, String nationalId,
               String name, String surname, String birthDate,
               Gender gender, String email, String phoneNumbers,
               String address, String programId, short enrollmentYear,
               short classYear, String photoUrl, String createdAt) {

    this.id = id;
    this.StudentNumber = studentNumber;
    this.NationalId = nationalId;
    this.Name = name;
    this.Surname = surname;
    this.BirthDate = birthDate;
    this.gender = gender;
    this.email = email;
    this.PhoneNumbers = phoneNumbers;
    this.Address = address;
    this.ProgramId = programId;
    this.EnrollmentYear = enrollmentYear;
    this.ClassYear = classYear;
    this.PhotoUrl = photoUrl;
    this.CreatedAt = createdAt;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getStudentNumber() {
    return StudentNumber;
}

public void setStudentNumber(String studentNumber) {
    this.StudentNumber = studentNumber;
}

public String getNationalId() {
    return NationalId;
}

public void setNationalId(String nationalId) {
    this.NationalId = nationalId;
}

public String getName() {
    return Name;
}

public void setName(String name) {
    this.Name = name;
}

public String getSurname() {
    return Surname;
}

public void setSurname(String surname) {
    this.Surname = surname;
}

public String getBirthDate() {
    return BirthDate;
}

public void setBirthDate(String birthDate) {
    this.BirthDate = birthDate;
}

public Gender getGender() {
    return gender;
}

public void setGender(Gender gender) {
    this.gender = gender;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPhoneNumbers() {
    return PhoneNumbers;
}

public void setPhoneNumbers(String phoneNumbers) {
    this.PhoneNumbers = phoneNumbers;
}

public String getAddress() {
    return Address;
}

public void setAddress(String address) {
    this.Address = address;
}

public String getProgramId() {
    return ProgramId;
}

public void setProgramId(String programId) {
    this.ProgramId = programId;
}

public short getEnrollmentYear() {
    return EnrollmentYear;
}

public void setEnrollmentYear(short enrollmentYear) {
    this.EnrollmentYear = enrollmentYear;
}

public short getClassYear() {
    return ClassYear;
}

public void setClassYear(short classYear) {
    this.ClassYear = classYear;
}

public String getPhotoUrl() {
    return PhotoUrl;
}

public void setPhotoUrl(String photoUrl) {
    this.PhotoUrl = photoUrl;
}

public String getCreatedAt() {
    return CreatedAt;
}

public void setCreatedAt(String createdAt) {
    this.CreatedAt = createdAt;
}

@Override
public String toString() {
    return "Student Details:\n" +
           " - ID: " + id + "\n" +
           " - Student Number: " + StudentNumber + "\n" +
           " - National ID: " + NationalId + "\n" +
           " - First Name: " + Name + "\n" +
           " - Last Name: " + Surname + "\n" +
           " - Birth Date: " + BirthDate + "\n" +
           " - Gender: " + gender + "\n" +
           " - Email: " + email + "\n" +
           " - Phone Number: " + PhoneNumbers + "\n" +
           " - Address: " + Address + "\n" +
           " - Program ID: " + ProgramId + "\n" +
           " - Enrollment Year: " + EnrollmentYear + "\n" +
           " - Class Year: " + ClassYear + "\n" +
           " - Photo URL: " + PhotoUrl + "\n" +
           " - Created At: " + CreatedAt;
}
}


