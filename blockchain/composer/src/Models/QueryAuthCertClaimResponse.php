<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthCertClaimResponse extends Model
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

    // 可验证声明id
    /**
     * @var string
     */
    public $vcId;

    // 交易hash（仅上链成功后会有值）
    /**
     * @var string
     */
    public $txHash;

    // vc详情
    /**
     * @var string
     */
    public $vcContent;

    // vc状态 0:未授权 1:已授权 2: 拒绝授权 3: 授权已撤销
    /**
     * @var int
     */
    public $status;

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 过期时间
    /**
     * @var int
     */
    public $expire;

    // 授权是否可撤销
    /**
     * @var bool
     */
    public $revocable;

    // 存证请求创建时间
    /**
     * @var string
     */
    public $gmtCreate;

    // 存证上链时间（仅上链成功后会有值）
    /**
     * @var string
     */
    public $gmtTransmit;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'vcId'        => 'vc_id',
        'txHash'      => 'tx_hash',
        'vcContent'   => 'vc_content',
        'status'      => 'status',
        'bizType'     => 'biz_type',
        'expire'      => 'expire',
        'revocable'   => 'revocable',
        'gmtCreate'   => 'gmt_create',
        'gmtTransmit' => 'gmt_transmit',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtTransmit', $this->gmtTransmit, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->vcContent) {
            $res['vc_content'] = $this->vcContent;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->revocable) {
            $res['revocable'] = $this->revocable;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtTransmit) {
            $res['gmt_transmit'] = $this->gmtTransmit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthCertClaimResponse
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
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['vc_content'])) {
            $model->vcContent = $map['vc_content'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['revocable'])) {
            $model->revocable = $map['revocable'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_transmit'])) {
            $model->gmtTransmit = $map['gmt_transmit'];
        }

        return $model;
    }
}
