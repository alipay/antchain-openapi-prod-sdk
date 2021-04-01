<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyDataauthorizationAuthorizationRequest extends Model
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

    // 申请人ID
    /**
     * @var string
     */
    public $applicantId;

    // 1592877833149
    /**
     * @var int
     */
    public $applicantTime;

    // 申请ID，业务系统唯一
    /**
     * @var string
     */
    public $bizUid;

    // 申请原因
    /**
     * @var string
     */
    public $comment;

    // 数据ID
    /**
     * @var string
     */
    public $dataId;

    // 扩展参数
    /**
     * @var string
     */
    public $extensionInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicantId'       => 'applicant_id',
        'applicantTime'     => 'applicant_time',
        'bizUid'            => 'biz_uid',
        'comment'           => 'comment',
        'dataId'            => 'data_id',
        'extensionInfo'     => 'extension_info',
    ];

    public function validate()
    {
        Model::validateRequired('applicantId', $this->applicantId, true);
        Model::validateRequired('applicantTime', $this->applicantTime, true);
        Model::validateRequired('bizUid', $this->bizUid, true);
        Model::validateRequired('comment', $this->comment, true);
        Model::validateRequired('dataId', $this->dataId, true);
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
        if (null !== $this->applicantId) {
            $res['applicant_id'] = $this->applicantId;
        }
        if (null !== $this->applicantTime) {
            $res['applicant_time'] = $this->applicantTime;
        }
        if (null !== $this->bizUid) {
            $res['biz_uid'] = $this->bizUid;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDataauthorizationAuthorizationRequest
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
        if (isset($map['applicant_id'])) {
            $model->applicantId = $map['applicant_id'];
        }
        if (isset($map['applicant_time'])) {
            $model->applicantTime = $map['applicant_time'];
        }
        if (isset($map['biz_uid'])) {
            $model->bizUid = $map['biz_uid'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }

        return $model;
    }
}
