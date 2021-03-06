//        Copyright (C) 2016 DigiGene, (www.DigiGene.com)(alinhayati[at]gmail[dot]com)
//
//        Licensed under the Apache License, Version 2.0 (the "License");
//        you may not use this file except in compliance with the License.
//        You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//        Unless required by applicable law or agreed to in writing, software
//        distributed under the License is distributed on an "AS IS" BASIS,
//        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//        See the License for the specific language governing permissions and
//        limitations under the License.

package com.digigene.autoupdate.presenter;

import com.digigene.autoupdate.EventBus.DownloadEvent;
import com.digigene.autoupdate.view.DownloadDialogView;

public interface DownloadDialogPresenter extends DownloadEvent {

    void startDownloading();

    String getStatusText();

    int getImageResourceId();

    void setView(DownloadDialogView downloadDialogView);

}
