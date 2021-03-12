<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class IdentityParam extends Model
{
    // 经办人姓名
    /**
     * @example 张某某
     *
     * @var string
     */
    public $agent;

    // 经办人身份证号
    /**
     * @example 130406200101012832
     *
     * @var string
     */
    public $agentId;

    // 用户的姓名
    /**
     * @example 李明
     *
     * @var string
     */
    public $certName;

    // 用户的身份证号
    /**
     * @example 410204200101013716
     *
     * @var string
     */
    public $certNo;

    // 用户证件类型，目前只支持IDENTITY_CARD
    /**
     * @example IDENTITY_CARD
     *
     * @var string
     */
    public $certType;

    // 法人姓名，企业认证必选
    /**
     * @example 张某某
     *
     * @var string
     */
    public $legalPerson;

    // 法人身份证，企业认证必选
    /**
     * @example 130406200101010634
     *
     * @var string
     */
    public $legalPersonId;

    // 手机号码
    /**
     * @example 18322331111
     *
     * @var string
     */
    public $mobileNo;

    // 扩展属性字段
    /**
     * @example {"key":"value"}
     *
     * @var string
     */
    public $properties;

    // 用户类型，默认为PERSON
    /**
     * @example PERSON,ENTERPRISE
     *
     * @var string
     */
    public $userType;
    protected $_name = [
        'agent'         => 'agent',
        'agentId'       => 'agent_id',
        'certName'      => 'cert_name',
        'certNo'        => 'cert_no',
        'certType'      => 'cert_type',
        'legalPerson'   => 'legal_person',
        'legalPersonId' => 'legal_person_id',
        'mobileNo'      => 'mobile_no',
        'properties'    => 'properties',
        'userType'      => 'user_type',
    ];

    public function validate()
    {
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->agent) {
            $res['agent'] = $this->agent;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = $this->legalPerson;
        }
        if (null !== $this->legalPersonId) {
            $res['legal_person_id'] = $this->legalPersonId;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentityParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['agent'])) {
            $model->agent = $map['agent'];
        }
        if (isset($map['agent_id'])) {
            $model->agentId = $map['agent_id'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['legal_person'])) {
            $model->legalPerson = $map['legal_person'];
        }
        if (isset($map['legal_person_id'])) {
            $model->legalPersonId = $map['legal_person_id'];
        }
        if (isset($map['mobile_no'])) {
            $model->mobileNo = $map['mobile_no'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }

        return $model;
    }
}
