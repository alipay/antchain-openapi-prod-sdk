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

    // 自清洁文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $checkLogFile;

    // 网页截图文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $screenshotFile;

    // 操作日志文件交易hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $processLogFileTxHash;

    // 自清洁日志文件交易hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $checkLogFileTxHash;
    protected $_name = [
        'processLogFile'       => 'process_log_file',
        'checkLogFile'         => 'check_log_file',
        'screenshotFile'       => 'screenshot_file',
        'processLogFileTxHash' => 'process_log_file_tx_hash',
        'checkLogFileTxHash'   => 'check_log_file_tx_hash',
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
        if (null !== $this->checkLogFile) {
            $res['check_log_file'] = $this->checkLogFile;
        }
        if (null !== $this->screenshotFile) {
            $res['screenshot_file'] = $this->screenshotFile;
        }
        if (null !== $this->processLogFileTxHash) {
            $res['process_log_file_tx_hash'] = $this->processLogFileTxHash;
        }
        if (null !== $this->checkLogFileTxHash) {
            $res['check_log_file_tx_hash'] = $this->checkLogFileTxHash;
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
        if (isset($map['check_log_file'])) {
            $model->checkLogFile = $map['check_log_file'];
        }
        if (isset($map['screenshot_file'])) {
            $model->screenshotFile = $map['screenshot_file'];
        }
        if (isset($map['process_log_file_tx_hash'])) {
            $model->processLogFileTxHash = $map['process_log_file_tx_hash'];
        }
        if (isset($map['check_log_file_tx_hash'])) {
            $model->checkLogFileTxHash = $map['check_log_file_tx_hash'];
        }

        return $model;
    }
}
