package com.alorma.github.sdk.services.repo;

import android.content.Context;
import com.alorma.github.sdk.bean.dto.response.Repo;
import com.alorma.github.sdk.bean.info.RepoInfo;
import retrofit.RestAdapter;
import rx.Observable;

/**
 * Created by Bernat on 17/07/2014.
 */
public class GetRepoClient extends GithubRepoClient<Repo> {

  public GetRepoClient(Context context, RepoInfo repoInfo) {
    super(context, repoInfo);
  }

  @Override
  protected Observable<Repo> getApiObservable(RestAdapter restAdapter) {
    return restAdapter.create(RepoService.class).get(getOwner(), getRepo());
  }
}
