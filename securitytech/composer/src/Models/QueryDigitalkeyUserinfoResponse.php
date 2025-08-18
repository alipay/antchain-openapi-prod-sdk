<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalkeyUserinfoResponse extends Model
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

    // 用户ID
    /**
     * @var string
     */
    public $uid;

    // 个人简介
    /**
     * @var string
     */
    public $introduction;

    // 用户昵称
    /**
     * @var string
     */
    public $nickName;

    // 用户头像地址
    /**
     * @var string
     */
    public $avatarUrl;

    // 品牌ID
    /**
     * @var string
     */
    public $brandId;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'uid'          => 'uid',
        'introduction' => 'introduction',
        'nickName'     => 'nick_name',
        'avatarUrl'    => 'avatar_url',
        'brandId'      => 'brand_id',
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
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->introduction) {
            $res['introduction'] = $this->introduction;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->avatarUrl) {
            $res['avatar_url'] = $this->avatarUrl;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDigitalkeyUserinfoResponse
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
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['introduction'])) {
            $model->introduction = $map['introduction'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['avatar_url'])) {
            $model->avatarUrl = $map['avatar_url'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }

        return $model;
    }
}
