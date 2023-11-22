<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class PullApiHaiguanasyncpollingResponse extends Model
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

    // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
    /**
     * @var string
     */
    public $instCode;

    // 请求id
    /**
     * @var string
     */
    public $bizRequestId;

    // 身份id，企业税号
    /**
     * @var string
     */
    public $identityId;

    // 数据文件地址集合，目前只会包含一个txt文件
    /**
     * @var string[]
     */
    public $fileList;

    // 解密密钥信封
    /**
     * @var string
     */
    public $secret;

    // 产品类型
    /**
     * @var string
     */
    public $authType;

    // 行方生成的授权编号
    /**
     * @var string
     */
    public $authCode;

    // 系统时间
    /**
     * @var string
     */
    public $timestamp;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'instCode'     => 'inst_code',
        'bizRequestId' => 'biz_request_id',
        'identityId'   => 'identity_id',
        'fileList'     => 'file_list',
        'secret'       => 'secret',
        'authType'     => 'auth_type',
        'authCode'     => 'auth_code',
        'timestamp'    => 'timestamp',
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
        if (null !== $this->bizRequestId) {
            $res['biz_request_id'] = $this->bizRequestId;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->fileList) {
            $res['file_list'] = $this->fileList;
        }
        if (null !== $this->secret) {
            $res['secret'] = $this->secret;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullApiHaiguanasyncpollingResponse
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
        if (isset($map['biz_request_id'])) {
            $model->bizRequestId = $map['biz_request_id'];
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['file_list'])) {
            if (!empty($map['file_list'])) {
                $model->fileList = $map['file_list'];
            }
        }
        if (isset($map['secret'])) {
            $model->secret = $map['secret'];
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

        return $model;
    }
}
