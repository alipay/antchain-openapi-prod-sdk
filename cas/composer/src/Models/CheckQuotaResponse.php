<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CheckQuotaResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 是够超额
    /**
     * @var bool
     */
    public $quotaExceed;

    // quota实例ID
    /**
     * @var string
     */
    public $quotaInsId;

    // dim_identity
    /**
     * @var string
     */
    public $dimIdentity;

    // 维度值
    /**
     * @var string
     */
    public $dimInsValue;

    // resource
    /**
     * @var string
     */
    public $resource;

    // 申请的资源的数量
    /**
     * @var int
     */
    public $count;

    // 当前剩余的量
    /**
     * @var int
     */
    public $remain;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'quotaExceed' => 'quota_exceed',
        'quotaInsId'  => 'quota_ins_id',
        'dimIdentity' => 'dim_identity',
        'dimInsValue' => 'dim_ins_value',
        'resource'    => 'resource',
        'count'       => 'count',
        'remain'      => 'remain',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->quotaExceed) {
            $res['quota_exceed'] = $this->quotaExceed;
        }
        if (null !== $this->quotaInsId) {
            $res['quota_ins_id'] = $this->quotaInsId;
        }
        if (null !== $this->dimIdentity) {
            $res['dim_identity'] = $this->dimIdentity;
        }
        if (null !== $this->dimInsValue) {
            $res['dim_ins_value'] = $this->dimInsValue;
        }
        if (null !== $this->resource) {
            $res['resource'] = $this->resource;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->remain) {
            $res['remain'] = $this->remain;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckQuotaResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['quota_exceed'])) {
            $model->quotaExceed = $map['quota_exceed'];
        }
        if (isset($map['quota_ins_id'])) {
            $model->quotaInsId = $map['quota_ins_id'];
        }
        if (isset($map['dim_identity'])) {
            $model->dimIdentity = $map['dim_identity'];
        }
        if (isset($map['dim_ins_value'])) {
            $model->dimInsValue = $map['dim_ins_value'];
        }
        if (isset($map['resource'])) {
            $model->resource = $map['resource'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['remain'])) {
            $model->remain = $map['remain'];
        }

        return $model;
    }
}
