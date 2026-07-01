<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdateContractOrganizationResponse extends Model
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

    // 证件号
    /**
     * @var string
     */
    public $idNumber;

    // 证件类型
    /**
     * @var string
     */
    public $idType;

    // 企业法人名称
    /**
     * @var string
     */
    public $legalPerson;

    // 企业法人证件号
    /**
     * @var string
     */
    public $legalPersonId;

    // 机构名称
    /**
     * @var string
     */
    public $name;

    // 机构账号id
    /**
     * @var string
     */
    public $organizationId;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'idNumber'       => 'id_number',
        'idType'         => 'id_type',
        'legalPerson'    => 'legal_person',
        'legalPersonId'  => 'legal_person_id',
        'name'           => 'name',
        'organizationId' => 'organization_id',
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
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = $this->legalPerson;
        }
        if (null !== $this->legalPersonId) {
            $res['legal_person_id'] = $this->legalPersonId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->organizationId) {
            $res['organization_id'] = $this->organizationId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContractOrganizationResponse
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
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['legal_person'])) {
            $model->legalPerson = $map['legal_person'];
        }
        if (isset($map['legal_person_id'])) {
            $model->legalPersonId = $map['legal_person_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['organization_id'])) {
            $model->organizationId = $map['organization_id'];
        }

        return $model;
    }
}
