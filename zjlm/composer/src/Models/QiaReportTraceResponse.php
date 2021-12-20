<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZJLM\Models;

use AlibabaCloud\Tea\Model;

class QiaReportTraceResponse extends Model
{
    // 任务编号
    /**
     * @example ddd
     *
     * @var string
     */
    public $qiId;

    // 颁发机构
    /**
     * @example df
     *
     * @var string
     */
    public $qiOrgName;

    // 区块链,哈希值
    /**
     * @example tx_hash
     *
     * @var string
     */
    public $txHash;

    // 有效期开始
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $qiStartTime;

    // 有效期结束
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $qiEndTime;

    // 认证证书资料
    /**
     * @example
     *
     * @var FileInfoModelResponse[]
     */
    public $certificationFiles;

    // 报告类型
    // * REPORT, 报告认证
    // * NEWSTANDARD, 新标质检
    /**
     * @example biz_type
     *
     * @var string
     */
    public $bizType;

    // 报告状态
    // * PASS 已通过
    /**
     * @example qi_status
     *
     * @var string
     */
    public $qiStatus;

    // 标签key
    /**
     * @example tagKey
     *
     * @var string
     */
    public $qiTagKey;

    // 标签名
    /**
     * @example 晨光质检
     *
     * @var string
     */
    public $qiTagName;
    protected $_name = [
        'qiId'               => 'qi_id',
        'qiOrgName'          => 'qi_org_name',
        'txHash'             => 'tx_hash',
        'qiStartTime'        => 'qi_start_time',
        'qiEndTime'          => 'qi_end_time',
        'certificationFiles' => 'certification_files',
        'bizType'            => 'biz_type',
        'qiStatus'           => 'qi_status',
        'qiTagKey'           => 'qi_tag_key',
        'qiTagName'          => 'qi_tag_name',
    ];

    public function validate()
    {
        Model::validateRequired('qiId', $this->qiId, true);
        Model::validateRequired('qiOrgName', $this->qiOrgName, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('qiStartTime', $this->qiStartTime, true);
        Model::validateRequired('qiEndTime', $this->qiEndTime, true);
        Model::validateRequired('certificationFiles', $this->certificationFiles, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('qiStatus', $this->qiStatus, true);
        Model::validateRequired('qiTagKey', $this->qiTagKey, true);
        Model::validateRequired('qiTagName', $this->qiTagName, true);
        Model::validatePattern('qiStartTime', $this->qiStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('qiEndTime', $this->qiEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->qiId) {
            $res['qi_id'] = $this->qiId;
        }
        if (null !== $this->qiOrgName) {
            $res['qi_org_name'] = $this->qiOrgName;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->qiStartTime) {
            $res['qi_start_time'] = $this->qiStartTime;
        }
        if (null !== $this->qiEndTime) {
            $res['qi_end_time'] = $this->qiEndTime;
        }
        if (null !== $this->certificationFiles) {
            $res['certification_files'] = [];
            if (null !== $this->certificationFiles && \is_array($this->certificationFiles)) {
                $n = 0;
                foreach ($this->certificationFiles as $item) {
                    $res['certification_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->qiStatus) {
            $res['qi_status'] = $this->qiStatus;
        }
        if (null !== $this->qiTagKey) {
            $res['qi_tag_key'] = $this->qiTagKey;
        }
        if (null !== $this->qiTagName) {
            $res['qi_tag_name'] = $this->qiTagName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QiaReportTraceResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['qi_id'])) {
            $model->qiId = $map['qi_id'];
        }
        if (isset($map['qi_org_name'])) {
            $model->qiOrgName = $map['qi_org_name'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['qi_start_time'])) {
            $model->qiStartTime = $map['qi_start_time'];
        }
        if (isset($map['qi_end_time'])) {
            $model->qiEndTime = $map['qi_end_time'];
        }
        if (isset($map['certification_files'])) {
            if (!empty($map['certification_files'])) {
                $model->certificationFiles = [];
                $n                         = 0;
                foreach ($map['certification_files'] as $item) {
                    $model->certificationFiles[$n++] = null !== $item ? FileInfoModelResponse::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['qi_status'])) {
            $model->qiStatus = $map['qi_status'];
        }
        if (isset($map['qi_tag_key'])) {
            $model->qiTagKey = $map['qi_tag_key'];
        }
        if (isset($map['qi_tag_name'])) {
            $model->qiTagName = $map['qi_tag_name'];
        }

        return $model;
    }
}
