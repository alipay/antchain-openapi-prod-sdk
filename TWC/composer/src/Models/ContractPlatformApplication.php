<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractPlatformApplication extends Model
{
    // 证件号
    /**
     * @example 311111111111111111
     *
     * @var string
     */
    public $idNumber;

    // 证件类型
    /**
     * @example CRED_ORG_USCC
     *
     * @var string
     */
    public $idType;

    // 企业法人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $orgLegalName;

    // 企业法人证件号
    /**
     * @example 311111111111111111
     *
     * @var string
     */
    public $orgLegalIdNumber;

    // 机构名称
    /**
     * @example 测试企业
     *
     * @var string
     */
    public $name;

    // 平台方账号id
    /**
     * @example 5c66842caf754a6dada4124b66666666
     *
     * @var string
     */
    public $platformId;
    protected $_name = [
        'idNumber'         => 'id_number',
        'idType'           => 'id_type',
        'orgLegalName'     => 'org_legal_name',
        'orgLegalIdNumber' => 'org_legal_id_number',
        'name'             => 'name',
        'platformId'       => 'platform_id',
    ];

    public function validate()
    {
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('platformId', $this->platformId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->orgLegalName) {
            $res['org_legal_name'] = $this->orgLegalName;
        }
        if (null !== $this->orgLegalIdNumber) {
            $res['org_legal_id_number'] = $this->orgLegalIdNumber;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractPlatformApplication
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['org_legal_name'])) {
            $model->orgLegalName = $map['org_legal_name'];
        }
        if (isset($map['org_legal_id_number'])) {
            $model->orgLegalIdNumber = $map['org_legal_id_number'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['platform_id'])) {
            $model->platformId = $map['platform_id'];
        }

        return $model;
    }
}
