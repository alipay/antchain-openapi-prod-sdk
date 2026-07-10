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

    // 全链路取证日志文件哈希
    /**
     * @example xxxx
     *
     * @var string
     */
    public $processLogFileHash;

    // 自清洁文件下载地址
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
    public $webScreenshotFile;

    // 网页截图文件哈希
    /**
     * @example xxxx
     *
     * @var string
     */
    public $webScreenshotFileHash;

    // 网页源码文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $webSourceFile;

    // 网页源码文件哈希
    /**
     * @example xxxx
     *
     * @var string
     */
    public $webSourceFileHash;

    // 视频源文件下载链接
    /**
     * @example http://xx
     *
     * @var string
     */
    public $videoFile;

    // 视频源文件哈希
    /**
     * @example xxxx
     *
     * @var string
     */
    public $videoFileHash;

    // 手机自清洁文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $extendDeviceCheckFile;

    // 手机自清洁文件哈希
    /**
     * @example xxxx
     *
     * @var string
     */
    public $extendDeviceCheckFileHash;

    // 手机操作日志下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $extendDeviceProcessFile;

    // 手机操作日志哈希
    /**
     * @example xxxx
     *
     * @var string
     */
    public $extendDeviceProcessFileHash;

    // 日志打包文件hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $logZipFileHash;

    // 日志打包文件上链hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $logZipTxHash;
    protected $_name = [
        'processLogFile'              => 'process_log_file',
        'processLogFileHash'          => 'process_log_file_hash',
        'checkLogFile'                => 'check_log_file',
        'checkLogFileHash'            => 'check_log_file_hash',
        'webScreenshotFile'           => 'web_screenshot_file',
        'webScreenshotFileHash'       => 'web_screenshot_file_hash',
        'webSourceFile'               => 'web_source_file',
        'webSourceFileHash'           => 'web_source_file_hash',
        'videoFile'                   => 'video_file',
        'videoFileHash'               => 'video_file_hash',
        'extendDeviceCheckFile'       => 'extend_device_check_file',
        'extendDeviceCheckFileHash'   => 'extend_device_check_file_hash',
        'extendDeviceProcessFile'     => 'extend_device_process_file',
        'extendDeviceProcessFileHash' => 'extend_device_process_file_hash',
        'logZipFileHash'              => 'log_zip_file_hash',
        'logZipTxHash'                => 'log_zip_tx_hash',
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
        if (null !== $this->processLogFileHash) {
            $res['process_log_file_hash'] = $this->processLogFileHash;
        }
        if (null !== $this->checkLogFile) {
            $res['check_log_file'] = $this->checkLogFile;
        }
        if (null !== $this->checkLogFileHash) {
            $res['check_log_file_hash'] = $this->checkLogFileHash;
        }
        if (null !== $this->webScreenshotFile) {
            $res['web_screenshot_file'] = $this->webScreenshotFile;
        }
        if (null !== $this->webScreenshotFileHash) {
            $res['web_screenshot_file_hash'] = $this->webScreenshotFileHash;
        }
        if (null !== $this->webSourceFile) {
            $res['web_source_file'] = $this->webSourceFile;
        }
        if (null !== $this->webSourceFileHash) {
            $res['web_source_file_hash'] = $this->webSourceFileHash;
        }
        if (null !== $this->videoFile) {
            $res['video_file'] = $this->videoFile;
        }
        if (null !== $this->videoFileHash) {
            $res['video_file_hash'] = $this->videoFileHash;
        }
        if (null !== $this->extendDeviceCheckFile) {
            $res['extend_device_check_file'] = $this->extendDeviceCheckFile;
        }
        if (null !== $this->extendDeviceCheckFileHash) {
            $res['extend_device_check_file_hash'] = $this->extendDeviceCheckFileHash;
        }
        if (null !== $this->extendDeviceProcessFile) {
            $res['extend_device_process_file'] = $this->extendDeviceProcessFile;
        }
        if (null !== $this->extendDeviceProcessFileHash) {
            $res['extend_device_process_file_hash'] = $this->extendDeviceProcessFileHash;
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
     * @return ScreenInfo
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
        if (isset($map['web_screenshot_file'])) {
            $model->webScreenshotFile = $map['web_screenshot_file'];
        }
        if (isset($map['web_screenshot_file_hash'])) {
            $model->webScreenshotFileHash = $map['web_screenshot_file_hash'];
        }
        if (isset($map['web_source_file'])) {
            $model->webSourceFile = $map['web_source_file'];
        }
        if (isset($map['web_source_file_hash'])) {
            $model->webSourceFileHash = $map['web_source_file_hash'];
        }
        if (isset($map['video_file'])) {
            $model->videoFile = $map['video_file'];
        }
        if (isset($map['video_file_hash'])) {
            $model->videoFileHash = $map['video_file_hash'];
        }
        if (isset($map['extend_device_check_file'])) {
            $model->extendDeviceCheckFile = $map['extend_device_check_file'];
        }
        if (isset($map['extend_device_check_file_hash'])) {
            $model->extendDeviceCheckFileHash = $map['extend_device_check_file_hash'];
        }
        if (isset($map['extend_device_process_file'])) {
            $model->extendDeviceProcessFile = $map['extend_device_process_file'];
        }
        if (isset($map['extend_device_process_file_hash'])) {
            $model->extendDeviceProcessFileHash = $map['extend_device_process_file_hash'];
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
