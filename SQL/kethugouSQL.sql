select
  bbs_post. * --使うテーブル
  , bbs_user. * 
from
  bbs_post 
  inner join bbs_user --INNNER JOINはテーブル内の結合、OUTER JOINは他のテーブルも使うOUTER HEAVENではない
    on bbs_post.user_id = bbs_user.id --両テーブルのユーザIDが一致させるか
where
  bbs_post.thread_id = 1; --条件はbbs_postのthread_idが１
