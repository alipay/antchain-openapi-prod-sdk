<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class RecordScreenData extends Model
{
    // 错误原因（状态为FAIL才有数据）
    /**
     * @example error
     *
     * @var string
     */
    public $errorReason;

    // 录屏文件Hash值
    /**
     * @example 00030a38fae767396d499b306c810d2f08c15773f8447d870e5e0235e6634ed10000
     *
     * @var string
     */
    public $fileHash;

    // 录屏结束时间
    /**
     * @example 11111
     *
     * @var int
     */
    public $gmtEnd;

    // 录屏开始时间
    /**
     * @example 111111
     *
     * @var int
     */
    public $gmtStart;

    // OS版本号
    /**
     * @example Microsoft Windows Server 2012 R2 Datacenter 64 位
     *
     * @var string
     */
    public $osVersion;

    // 录屏文件信息
    /**
     * @example
     *
     * @var ScreenInfo
     */
    public $screenInfo;

    // 证据包下载地址（状态为SUCCESS 才有数据）
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $screenZip;

    // 录屏软件版本号
    /**
     * @example 1.0.24
     *
     * @var string
     */
    public $swVersion;

    // 可信时间戳的返回对象
    /**
     * @example {"cTSR":"1f8b080000009d0e6c198caccc2c4c","code":"0","hashAlgorithm":"sha256","hashedMessage":"3585100148072894b8","sN":"TTAS_S.0.2_87310861339018912","tS":1602672018916,"version":"2.0"}
     *
     * @var string
     */
    public $tsr;

    // 统一证据编号
    /**
     * @example 1d642de2e838c809965768d7fd63230c10ad8740809b5bc0a070855397674ea5
     *
     * @var string
     */
    public $txHash;

    // 录屏文件大小
    /**
     * @example 111111
     *
     * @var int
     */
    public $fileSize;

    // 录屏文件存证块高
    /**
     * @example 1212121
     *
     * @var int
     */
    public $blockHeight;

    // 录屏文件上链时间
    /**
     * @example 1605597503000
     *
     * @var int
     */
    public $timestamp;

    // 录屏文件公证处证书下载链接
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

    // 证据包存证交易hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $zipTxHash;

    // 取证备注信息
    /**
     * @example {    "urls": [       "https://www.baidu.com",       "https://www.mydcs.com"    ] }
     *
     * @var string
     */
    public $inventory;

    // 证据包文件hash
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $zipFileHash;
    protected $_name = [
        'errorReason'          => 'error_reason',
        'fileHash'             => 'file_hash',
        'gmtEnd'               => 'gmt_end',
        'gmtStart'             => 'gmt_start',
        'osVersion'            => 'os_version',
        'screenInfo'           => 'screen_info',
        'screenZip'            => 'screen_zip',
        'swVersion'            => 'sw_version',
        'tsr'                  => 'tsr',
        'txHash'               => 'tx_hash',
        'fileSize'             => 'file_size',
        'blockHeight'          => 'block_height',
        'timestamp'            => 'timestamp',
        'certificateUrl'       => 'certificate_url',
        'certificateStorageNo' => 'certificate_storage_no',
        'zipTxHash'            => 'zip_tx_hash',
        'inventory'            => 'inventory',
        'zipFileHash'          => 'zip_file_hash',
    ];

    public function validate()
    {
        Model::validateRequired('gmtEnd', $this->gmtEnd, true);
        Model::validateRequired('gmtStart', $this->gmtStart, true);
        Model::validateRequired('osVersion', $this->osVersion, true);
        Model::validateRequired('swVersion', $this->swVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->errorReason) {
            $res['error_reason'] = $this->errorReason;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        if (null !== $this->gmtEnd) {
            $res['gmt_end'] = $this->gmtEnd;
        }
        if (null !== $this->gmtStart) {
            $res['gmt_start'] = $this->gmtStart;
        }
        if (null !== $this->osVersion) {
            $res['os_version'] = $this->osVersion;
        }
        if (null !== $this->screenInfo) {
            $res['screen_info'] = null !== $this->screenInfo ? $this->screenInfo->toMap() : null;
        }
        if (null !== $this->screenZip) {
            $res['screen_zip'] = $this->screenZip;
        }
        if (null !== $this->swVersion) {
            $res['sw_version'] = $this->swVersion;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }
        if (null !== $this->certificateStorageNo) {
            $res['certificate_storage_no'] = $this->certificateStorageNo;
        }
        if (null !== $this->zipTxHash) {
            $res['zip_tx_hash'] = $this->zipTxHash;
        }
        if (null !== $this->inventory) {
            $res['inventory'] = $this->inventory;
        }
        if (null !== $this->zipFileHash) {
            $res['zip_file_hash'] = $this->zipFileHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecordScreenData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['error_reason'])) {
            $model->errorReason = $map['error_reason'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }
        if (isset($map['gmt_end'])) {
            $model->gmtEnd = $map['gmt_end'];
        }
        if (isset($map['gmt_start'])) {
            $model->gmtStart = $map['gmt_start'];
        }
        if (isset($map['os_version'])) {
            $model->osVersion = $map['os_version'];
        }
        if (isset($map['screen_info'])) {
            $model->screenInfo = ScreenInfo::fromMap($map['screen_info']);
        }
        if (isset($map['screen_zip'])) {
            $model->screenZip = $map['screen_zip'];
        }
        if (isset($map['sw_version'])) {
            $model->swVersion = $map['sw_version'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['file_size'])) {
            $model->fileSize = $map['file_size'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }
        if (isset($map['certificate_storage_no'])) {
            $model->certificateStorageNo = $map['certificate_storage_no'];
        }
        if (isset($map['zip_tx_hash'])) {
            $model->zipTxHash = $map['zip_tx_hash'];
        }
        if (isset($map['inventory'])) {
            $model->inventory = $map['inventory'];
        }
        if (isset($map['zip_file_hash'])) {
            $model->zipFileHash = $map['zip_file_hash'];
        }

        return $model;
    }
}
