package com.iss.training.spring.beans;

import com.iss.training.spring.enums.Format;
import com.iss.training.spring.qualifiers.MovieQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

@Component
public class ApplicationInfo {

    // this bean is resolved by type and name as a default qualifier
    @Autowired
    private User user;

    // this bean is resolved by type and name as a default qualifier
    @Autowired
    private User admin;

    // conflict resolved by using name qualifier
    @Autowired
    @Qualifier("user")
    private User someUser;

    // conflict resolved by using qualifier explicitly configured
    @Autowired
    @Qualifier("user2")
    private User someUser2;

    // used @Resource to autowire by name
    @Resource(name = "otherUser2")
    private User someUser3;

    @Autowired
    private User[] userArray;

    @Autowired
    private List<User> userList;

    @Autowired
    private Set<User> userSet;

    @Autowired
    private Map<String, User> userMap;

    // collection group by qualifier
    @Autowired
    @Qualifier("userGroup")
    private Map<String, User> userMapGroup;

    // two beans of type Info; conflict resolved by using @Primary on one of them
    @Autowired
    private Info info;

    // used custom qualifier to resolve conflict
    @Autowired
    @MovieQualifier(genre = "comedy", format = Format.VHS)
    private MovieCatalog movies;

    // bean of type Person not defined; resolve this by using required=false
    @Autowired(required = false)
    private Person person;

    // bean of type Person not defined; resolve this by using @Nullable
    @Autowired
    @Nullable
    private Person person1;

    // bean of type Person not defined; resolve this by using Optional
    @Autowired
    private Optional<Person> person2;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public User getSomeUser() {
        return someUser;
    }

    public void setSomeUser(User someUser) {
        this.someUser = someUser;
    }

    public User getSomeUser2() {
        return someUser2;
    }

    public void setSomeUser2(User someUser2) {
        this.someUser2 = someUser2;
    }

    public User getSomeUser3() {
        return someUser3;
    }

    public void setSomeUser3(User someUser3) {
        this.someUser3 = someUser3;
    }

    public User[] getUserArray() {
        return userArray;
    }

    public void setUserArray(User[] userArray) {
        this.userArray = userArray;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Map<String, User> getUserMapGroup() {
        return userMapGroup;
    }

    public void setUserMapGroup(Map<String, User> userMapGroup) {
        this.userMapGroup = userMapGroup;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public MovieCatalog getMovies() {
        return movies;
    }

    public void setMovies(MovieCatalog movies) {
        this.movies = movies;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson1() {
        return person1;
    }

    public void setPerson1(Person person1) {
        this.person1 = person1;
    }

    public Optional<Person> getPerson2() {
        return person2;
    }

    public void setPerson2(Optional<Person> person2) {
        this.person2 = person2;
    }

    @Override
    public String toString() {
        return "ApplicationInfo{" +
                "user=" + user +
                ", admin=" + admin +
                ", someUser=" + someUser +
                ", someUser2=" + someUser2 +
                ", someUser3=" + someUser3 +
                ", userArray=" + Arrays.toString(userArray) +
                ", userList=" + userList +
                ", userSet=" + userSet +
                ", userMap=" + userMap +
                ", userMapGroup=" + userMapGroup +
                ", info=" + info +
                ", movies=" + movies +
                ", person=" + person +
                ", person1=" + person1 +
                ", person2=" + person2 +
                '}';
    }
}
