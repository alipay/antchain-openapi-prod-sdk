<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class InitEkytTrustsignRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 请求头
    /**
     * @var RequestHead
     */
    public $head;

    // 签约用户信息
    /**
     * @var string
     */
    public $signUser;

    // 控件key-value
    /**
     * @var string
     */
    public $rectId;

    // 签约方案码
    /**
     * @var string
     */
    public $solutionCode;

    // 发起签约的外部流水号
    /**
     * @var string
     */
    public $outOrderNo;

    // 小程序appId
    /**
     * @var string
     */
    public $appId;

    // 用户授权标识
    /**
     * @var string
     */
    public $userAuthorization;

    // 扩展信息
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'head'              => 'head',
        'signUser'          => 'sign_user',
        'rectId'            => 'rect_id',
        'solutionCode'      => 'solution_code',
        'outOrderNo'        => 'out_order_no',
        'appId'             => 'app_id',
        'userAuthorization' => 'user_authorization',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('head', $this->head, true);
        Model::validateRequired('signUser', $this->signUser, true);
        Model::validateRequired('solutionCode', $this->solutionCode, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('userAuthorization', $this->userAuthorization, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->head) {
            $res['head'] = null !== $this->head ? $this->head->toMap() : null;
        }
        if (null !== $this->signUser) {
            $res['sign_user'] = $this->signUser;
        }
        if (null !== $this->rectId) {
            $res['rect_id'] = $this->rectId;
        }
        if (null !== $this->solutionCode) {
            $res['solution_code'] = $this->solutionCode;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->userAuthorization) {
            $res['user_authorization'] = $this->userAuthorization;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitEkytTrustsignRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['head'])) {
            $model->head = RequestHead::fromMap($map['head']);
        }
        if (isset($map['sign_user'])) {
            $model->signUser = $map['sign_user'];
        }
        if (isset($map['rect_id'])) {
            $model->rectId = $map['rect_id'];
        }
        if (isset($map['solution_code'])) {
            $model->solutionCode = $map['solution_code'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['user_authorization'])) {
            $model->userAuthorization = $map['user_authorization'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
