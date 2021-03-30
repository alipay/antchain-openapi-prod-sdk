<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ScreenshotInfo extends Model
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
    public $screenshotFile;
    protected $_name = [
        'processLogFile' => 'process_log_file',
        'screenshotFile' => 'screenshot_file',
    ];

    public function validate()
    {
        Model::validateRequired('screenshotFile', $this->screenshotFile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->processLogFile) {
            $res['process_log_file'] = $this->processLogFile;
        }
        if (null !== $this->screenshotFile) {
            $res['screenshot_file'] = $this->screenshotFile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScreenshotInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['process_log_file'])) {
            $model->processLogFile = $map['process_log_file'];
        }
        if (isset($map['screenshot_file'])) {
            $model->screenshotFile = $map['screenshot_file'];
        }

        return $model;
    }
}
