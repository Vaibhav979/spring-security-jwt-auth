
@Repository
public interface UserRepository implements JpaRepository<User, Integer> {
    User findByUsername(String username);
}
