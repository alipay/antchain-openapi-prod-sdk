<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PullAuthWebpageVcResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // C类用户实际授权发生的时间，GMT标准时间
    /**
     * @var int
     */
    public $gmtAuthTime;

    // 企业B类的唯一ID，对应的did在vc_content中的subject字段
    /**
     * @var string
     */
    public $pkId;

    // 当前声明的状态说明： 0：用户未授权 1：用户授权成功，此时vc_content字段会包含授权后的声明内容 ，101：信息校验失败，其他授权错误码情况待明确
    /**
     * @var string
     */
    public $status;

    // 授权的可验证声明具体类型说明，有助于未来业务区分不同授权场景。
    /**
     * @var string
     */
    public $type;

    // C类用户的唯一ID，当前为通过姓名+身份证号组合计算哈希得到user_id = sha256(name+certNo)，对应的did在vc_content中的issuer字段
    /**
     * @var string
     */
    public $userId;

    // 如果status的值是“1”，则此字段就是用户授权成功后的声明（vc）的完整内容。
    /**
     * @var string
     */
    public $vcContent;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'gmtAuthTime' => 'gmt_auth_time',
        'pkId'        => 'pk_id',
        'status'      => 'status',
        'type'        => 'type',
        'userId'      => 'user_id',
        'vcContent'   => 'vc_content',
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
        if (null !== $this->gmtAuthTime) {
            $res['gmt_auth_time'] = $this->gmtAuthTime;
        }
        if (null !== $this->pkId) {
            $res['pk_id'] = $this->pkId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->vcContent) {
            $res['vc_content'] = $this->vcContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullAuthWebpageVcResponse
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
        if (isset($map['gmt_auth_time'])) {
            $model->gmtAuthTime = $map['gmt_auth_time'];
        }
        if (isset($map['pk_id'])) {
            $model->pkId = $map['pk_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['vc_content'])) {
            $model->vcContent = $map['vc_content'];
        }

        return $model;
    }
}
