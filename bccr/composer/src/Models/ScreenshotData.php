<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ScreenshotData extends Model
{
    // 取证地址
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $url;

    // 网页取证时间
    /**
     * @example 111111
     *
     * @var int
     */
    public $gmtEvidence;

    // 网页取证文件Hash值
    /**
     * @example 00030a38fae767396d499b306c810d2f08c15773f8447d870e5e0235e6634ed10000
     *
     * @var string
     */
    public $fileHash;

    // 网页取证文件大小
    /**
     * @example 111111
     *
     * @var int
     */
    public $fileSize;

    // 统一证据编号
    /**
     * @example 1d642de2e838c809965768d7fd63230c10ad8740809b5bc0a070855397674ea5
     *
     * @var string
     */
    public $txHash;

    // 网页取证文件存证块高
    /**
     * @example 111111
     *
     * @var int
     */
    public $blockHeight;

    // 网页取证文件上链时间
    /**
     * @example 111111
     *
     * @var int
     */
    public $timestamp;

    // 可信时间戳的返回对象
    /**
     * @example {"cTSR":"1f8b080000009d0e6c198caccc2c4c","code":"0","hashAlgorithm":"sha256","hashedMessage":"3585100148072894b8","sN":"TTAS_S.0.2_87310861339018912","tS":1602672018916,"version":"2.0"}
     *
     * @var string
     */
    public $tsr;

    // 网页截图文件公证处证书下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $certificateUrl;

    // 公证处证书编号
    /**
     * @example 111111
     *
     * @var string
     */
    public $certificateStorageNo;

    // 网页取证工具软件版本号
    /**
     * @example 0.0.1
     *
     * @var string
     */
    public $toolVersion;

    // 证据包下载地址（状态为SUCCESS 才有数据）
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $screenshotZip;

    // 取证文件信息
    /**
     * @example 111111
     *
     * @var ScreenshotInfo
     */
    public $screenshotInfo;

    // 网页title
    /**
     * @example 测试
     *
     * @var string
     */
    public $headTitle;

    // 证据包交易hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $zipTxHash;

    // 网页取证失败原因
    /**
     * @example error
     *
     * @var string
     */
    public $errorReason;

    // 中文失败原因
    /**
     * @example 中文失败原因
     *
     * @var string
     */
    public $errorReasonCn;

    // 证据包文件hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $zipFileHash;
    protected $_name = [
        'url'                  => 'url',
        'gmtEvidence'          => 'gmt_evidence',
        'fileHash'             => 'file_hash',
        'fileSize'             => 'file_size',
        'txHash'               => 'tx_hash',
        'blockHeight'          => 'block_height',
        'timestamp'            => 'timestamp',
        'tsr'                  => 'tsr',
        'certificateUrl'       => 'certificate_url',
        'certificateStorageNo' => 'certificate_storage_no',
        'toolVersion'          => 'tool_version',
        'screenshotZip'        => 'screenshot_zip',
        'screenshotInfo'       => 'screenshot_info',
        'headTitle'            => 'head_title',
        'zipTxHash'            => 'zip_tx_hash',
        'errorReason'          => 'error_reason',
        'errorReasonCn'        => 'error_reason_cn',
        'zipFileHash'          => 'zip_file_hash',
    ];

    public function validate()
    {
        Model::validateRequired('url', $this->url, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->gmtEvidence) {
            $res['gmt_evidence'] = $this->gmtEvidence;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }
        if (null !== $this->certificateStorageNo) {
            $res['certificate_storage_no'] = $this->certificateStorageNo;
        }
        if (null !== $this->toolVersion) {
            $res['tool_version'] = $this->toolVersion;
        }
        if (null !== $this->screenshotZip) {
            $res['screenshot_zip'] = $this->screenshotZip;
        }
        if (null !== $this->screenshotInfo) {
            $res['screenshot_info'] = null !== $this->screenshotInfo ? $this->screenshotInfo->toMap() : null;
        }
        if (null !== $this->headTitle) {
            $res['head_title'] = $this->headTitle;
        }
        if (null !== $this->zipTxHash) {
            $res['zip_tx_hash'] = $this->zipTxHash;
        }
        if (null !== $this->errorReason) {
            $res['error_reason'] = $this->errorReason;
        }
        if (null !== $this->errorReasonCn) {
            $res['error_reason_cn'] = $this->errorReasonCn;
        }
        if (null !== $this->zipFileHash) {
            $res['zip_file_hash'] = $this->zipFileHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScreenshotData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['gmt_evidence'])) {
            $model->gmtEvidence = $map['gmt_evidence'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }
        if (isset($map['file_size'])) {
            $model->fileSize = $map['file_size'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }
        if (isset($map['certificate_storage_no'])) {
            $model->certificateStorageNo = $map['certificate_storage_no'];
        }
        if (isset($map['tool_version'])) {
            $model->toolVersion = $map['tool_version'];
        }
        if (isset($map['screenshot_zip'])) {
            $model->screenshotZip = $map['screenshot_zip'];
        }
        if (isset($map['screenshot_info'])) {
            $model->screenshotInfo = ScreenshotInfo::fromMap($map['screenshot_info']);
        }
        if (isset($map['head_title'])) {
            $model->headTitle = $map['head_title'];
        }
        if (isset($map['zip_tx_hash'])) {
            $model->zipTxHash = $map['zip_tx_hash'];
        }
        if (isset($map['error_reason'])) {
            $model->errorReason = $map['error_reason'];
        }
        if (isset($map['error_reason_cn'])) {
            $model->errorReasonCn = $map['error_reason_cn'];
        }
        if (isset($map['zip_file_hash'])) {
            $model->zipFileHash = $map['zip_file_hash'];
        }

        return $model;
    }
}
