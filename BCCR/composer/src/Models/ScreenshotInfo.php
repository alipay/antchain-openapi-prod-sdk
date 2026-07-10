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

    // 全链路取证日志文件哈希
    /**
     * @example xxxx
     *
     * @var string
     */
    public $processLogFileHash;

    // 自清洁文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $checkLogFile;

    // 自清洁文件哈希
    /**
     * @example xxxx
     *
     * @var string
     */
    public $checkLogFileHash;

    // 网页截图文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $screenshotFile;

    // 网页截图文件哈希
    /**
     * @example xxxx
     *
     * @var string
     */
    public $screenshotFileHash;

    // 日志打包文件hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $logZipFileHash;

    // 日志文件上链hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $logZipTxHash;
    protected $_name = [
        'processLogFile'     => 'process_log_file',
        'processLogFileHash' => 'process_log_file_hash',
        'checkLogFile'       => 'check_log_file',
        'checkLogFileHash'   => 'check_log_file_hash',
        'screenshotFile'     => 'screenshot_file',
        'screenshotFileHash' => 'screenshot_file_hash',
        'logZipFileHash'     => 'log_zip_file_hash',
        'logZipTxHash'       => 'log_zip_tx_hash',
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
        if (null !== $this->processLogFileHash) {
            $res['process_log_file_hash'] = $this->processLogFileHash;
        }
        if (null !== $this->checkLogFile) {
            $res['check_log_file'] = $this->checkLogFile;
        }
        if (null !== $this->checkLogFileHash) {
            $res['check_log_file_hash'] = $this->checkLogFileHash;
        }
        if (null !== $this->screenshotFile) {
            $res['screenshot_file'] = $this->screenshotFile;
        }
        if (null !== $this->screenshotFileHash) {
            $res['screenshot_file_hash'] = $this->screenshotFileHash;
        }
        if (null !== $this->logZipFileHash) {
            $res['log_zip_file_hash'] = $this->logZipFileHash;
        }
        if (null !== $this->logZipTxHash) {
            $res['log_zip_tx_hash'] = $this->logZipTxHash;
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
        if (isset($map['process_log_file_hash'])) {
            $model->processLogFileHash = $map['process_log_file_hash'];
        }
        if (isset($map['check_log_file'])) {
            $model->checkLogFile = $map['check_log_file'];
        }
        if (isset($map['check_log_file_hash'])) {
            $model->checkLogFileHash = $map['check_log_file_hash'];
        }
        if (isset($map['screenshot_file'])) {
            $model->screenshotFile = $map['screenshot_file'];
        }
        if (isset($map['screenshot_file_hash'])) {
            $model->screenshotFileHash = $map['screenshot_file_hash'];
        }
        if (isset($map['log_zip_file_hash'])) {
            $model->logZipFileHash = $map['log_zip_file_hash'];
        }
        if (isset($map['log_zip_tx_hash'])) {
            $model->logZipTxHash = $map['log_zip_tx_hash'];
        }

        return $model;
    }
}
