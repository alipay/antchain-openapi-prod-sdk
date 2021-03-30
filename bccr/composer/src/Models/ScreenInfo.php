<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ScreenInfo extends Model
{
    // 全链路取证日志文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $processLogFile;

    // 网页截图文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $webScreenshotFile;

    // 网页源码文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $webSourceFile;

    // 视频源文件下载链接
    /**
     * @example http://xx
     *
     * @var string
     */
    public $videoFile;
    protected $_name = [
        'processLogFile'    => 'process_log_file',
        'webScreenshotFile' => 'web_screenshot_file',
        'webSourceFile'     => 'web_source_file',
        'videoFile'         => 'video_file',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->processLogFile) {
            $res['process_log_file'] = $this->processLogFile;
        }
        if (null !== $this->webScreenshotFile) {
            $res['web_screenshot_file'] = $this->webScreenshotFile;
        }
        if (null !== $this->webSourceFile) {
            $res['web_source_file'] = $this->webSourceFile;
        }
        if (null !== $this->videoFile) {
            $res['video_file'] = $this->videoFile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScreenInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['process_log_file'])) {
            $model->processLogFile = $map['process_log_file'];
        }
        if (isset($map['web_screenshot_file'])) {
            $model->webScreenshotFile = $map['web_screenshot_file'];
        }
        if (isset($map['web_source_file'])) {
            $model->webSourceFile = $map['web_source_file'];
        }
        if (isset($map['video_file'])) {
            $model->videoFile = $map['video_file'];
        }

        return $model;
    }
}
