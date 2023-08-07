<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class PullApiSimpleauthasyncpollingResponse extends Model
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

    // 租户号
    /**
     * @var string
     */
    public $instCode;

    // 纳税人识别号
    /**
     * @var string
     */
    public $identityId;

    // 和查询的biz_request_id相同
    /**
     * @var string
     */
    public $bizRequestId;

    // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
    /**
     * @var string
     */
    public $authType;

    // 行方生成的授权编号
    /**
     * @var string
     */
    public $authCode;

    // 时间戳
    /**
     * @var string
     */
    public $timestamp;

    // 极简授权文件地址列表
    /**
     * @var string[]
     */
    public $fileList;

    // 秘钥
    /**
     * @var string
     */
    public $secret;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'instCode'     => 'inst_code',
        'identityId'   => 'identity_id',
        'bizRequestId' => 'biz_request_id',
        'authType'     => 'auth_type',
        'authCode'     => 'auth_code',
        'timestamp'    => 'timestamp',
        'fileList'     => 'file_list',
        'secret'       => 'secret',
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
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->bizRequestId) {
            $res['biz_request_id'] = $this->bizRequestId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->fileList) {
            $res['file_list'] = $this->fileList;
        }
        if (null !== $this->secret) {
            $res['secret'] = $this->secret;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullApiSimpleauthasyncpollingResponse
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
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['biz_request_id'])) {
            $model->bizRequestId = $map['biz_request_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['file_list'])) {
            if (!empty($map['file_list'])) {
                $model->fileList = $map['file_list'];
            }
        }
        if (isset($map['secret'])) {
            $model->secret = $map['secret'];
        }

        return $model;
    }
}
