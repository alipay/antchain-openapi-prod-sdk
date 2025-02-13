<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySimLoginResponse extends Model
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

    // 登录结果
    // NO_RESULT：暂无登录结果
    // EXPIRED：token过期
    // ACTIVATE_OK：激活成功，店长首次登录成功
    // LOGIN_OK：登录成功
    // USER_NOT_EXIST：用户不存在
    // STORE_NOT_ACTIVATED：门店未激活
    /**
     * @var string
     */
    public $loginResult;

    // 登录结果中文信息
    /**
     * @var string
     */
    public $loginMsg;

    // 是否已经激活
    /**
     * @var bool
     */
    public $activated;

    // 登录/激活时间，格式yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $loginTime;

    // 当前登录的门店信息
    /**
     * @var SimStoreInfo
     */
    public $storeInfo;

    // 当前登录的销售信息
    /**
     * @var SimSalesInfo
     */
    public $salesInfo;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'loginResult' => 'login_result',
        'loginMsg'    => 'login_msg',
        'activated'   => 'activated',
        'loginTime'   => 'login_time',
        'storeInfo'   => 'store_info',
        'salesInfo'   => 'sales_info',
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
        if (null !== $this->loginResult) {
            $res['login_result'] = $this->loginResult;
        }
        if (null !== $this->loginMsg) {
            $res['login_msg'] = $this->loginMsg;
        }
        if (null !== $this->activated) {
            $res['activated'] = $this->activated;
        }
        if (null !== $this->loginTime) {
            $res['login_time'] = $this->loginTime;
        }
        if (null !== $this->storeInfo) {
            $res['store_info'] = null !== $this->storeInfo ? $this->storeInfo->toMap() : null;
        }
        if (null !== $this->salesInfo) {
            $res['sales_info'] = null !== $this->salesInfo ? $this->salesInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySimLoginResponse
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
        if (isset($map['login_result'])) {
            $model->loginResult = $map['login_result'];
        }
        if (isset($map['login_msg'])) {
            $model->loginMsg = $map['login_msg'];
        }
        if (isset($map['activated'])) {
            $model->activated = $map['activated'];
        }
        if (isset($map['login_time'])) {
            $model->loginTime = $map['login_time'];
        }
        if (isset($map['store_info'])) {
            $model->storeInfo = SimStoreInfo::fromMap($map['store_info']);
        }
        if (isset($map['sales_info'])) {
            $model->salesInfo = SimSalesInfo::fromMap($map['sales_info']);
        }

        return $model;
    }
}
