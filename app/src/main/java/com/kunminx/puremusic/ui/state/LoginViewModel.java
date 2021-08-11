/*
 * Copyright 2018-present KunMinX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kunminx.puremusic.ui.state;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

import com.kunminx.puremusic.domain.request.AccountRequest;

/**
 * TODO tip：每个页面都要单独准备一个 state-ViewModel，
 * 来托管 DataBinding 绑定的临时状态，以及视图控制器重建时状态的恢复。
 * <p>
 * 此外，state-ViewModel 的职责仅限于 状态托管，不建议在此处理 UI 逻辑，
 * UI 逻辑只适合在 Activity/Fragment 等视图控制器中完成，是 “数据驱动” 的一部分，
 * 将来升级到 Jetpack Compose 更是如此。
 * <p>
 * 如果这样说还不理解的话，详见 https://xiaozhuanlan.com/topic/9816742350
 * <p>
 * Create by KunMinX at 20/04/26
 */
public class LoginViewModel extends ViewModel {

  public final ObservableField<String> name = new ObservableField<>();

  public final ObservableField<String> password = new ObservableField<>();

  public final ObservableBoolean loadingVisible = new ObservableBoolean();

  //TODO tip 2：将 request 作为 ViewModel 的成员暴露给 Activity/Fragment，
  // 如此便于语义的明确，以及实现多个 request 在 ViewModel 中的组合和复用。

  //如果这样说还不理解的话，详见《如何让同事爱上架构模式、少写 bug 多注释》的解析
  //https://xiaozhuanlan.com/topic/8204519736

  public final AccountRequest accountRequest = new AccountRequest();

}
