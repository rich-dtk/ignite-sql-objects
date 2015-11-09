package io.dtk;
import org.apache.ignite.cache.query.annotations.QuerySqlField;
import java.io.Serializable;

public class Actor implements Serializable {
  @QuerySqlField
  private String avatar_url;
  @QuerySqlField
  private String gravatar_id;
  @QuerySqlField
  private Long id; 
  @QuerySqlField(index = true)
  private String login;
  @QuerySqlField
  private String url;

  public Actor(
    String avatar_url,
    String gravatar_id,
    Long id, 
    String login,
    String url
    ) {
      this.avatar_url = avatar_url;
      this.gravatar_id = gravatar_id;
      this.id = id;
      this.login = login;
      this.url = url;
    }

    /**
     * Gets avatar_url
     *
     * @return Value for avatar_url
     */
    public String getAvatar_url() {
        return avatar_url;
    }

    /**
     * Gets gravatar_id
     *
     * @return Value for gravatar_id
     */
    public String getGravatarId() {
        return gravatar_id;
    }

    /**
     * Gets id
     *
     * @return Value for id
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets login
     *
     * @return Value for login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Gets url
     *
     * @return Value for url
     */
    public String getUrl() {
        return url;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "Actor [login=" + login +
            ", avatar_url=" + avatar_url +
            ", gravatar_id=" + gravatar_id +
            ", url=" + url +
            "]";
    }

}



