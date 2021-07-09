<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractCreatorApplication extends Model
{
    // 邮箱地址
    /**
     * @example wutest@tsign.com
     *
     * @var string
     */
    public $email;

    // 证件号
    /**
     * @example 311111111111111111
     *
     * @var string
     */
    public $idNumber;

    // 证件类型
    /**
     * @example CRED_PSN_CH_IDCARD
     *
     * @var string
     */
    public $idType;

    // 手机号码
    /**
     * @example 15811111111
     *
     * @var string
     */
    public $mobile;

    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 创建人ID
    /**
     * @example 0178c086a740475caf516f37901352b3
     *
     * @var string
     */
    public $creatorId;
    protected $_name = [
        'email'     => 'email',
        'idNumber'  => 'id_number',
        'idType'    => 'id_type',
        'mobile'    => 'mobile',
        'name'      => 'name',
        'creatorId' => 'creator_id',
    ];

    public function validate()
    {
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('creatorId', $this->creatorId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->creatorId) {
            $res['creator_id'] = $this->creatorId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractCreatorApplication
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['creator_id'])) {
            $model->creatorId = $map['creator_id'];
        }

        return $model;
    }
}
