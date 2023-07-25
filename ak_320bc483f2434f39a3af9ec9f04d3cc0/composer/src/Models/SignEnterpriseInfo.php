<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class SignEnterpriseInfo extends Model
{
    // 公司名称
    /**
     * @example 某某公司
     *
     * @var string
     */
    public $organizationName;

    // 社会统一信用代码
    /**
     * @example 123435
     *
     * @var string
     */
    public $uscc;

    // 法人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 法人身份证号码
    /**
     * @example 12344545
     *
     * @var string
     */
    public $idNumber;

    // 签署模式0、自动签署1、手动签署（用户只能手动）
    //
    /**
     * @example 0
     *
     * @var int
     */
    public $signType;

    // 签署区列表
    /**
     * @example -
     *
     * @var SignatoryInfo[]
     */
    public $signAreaList;
    protected $_name = [
        'organizationName' => 'organization_name',
        'uscc'             => 'uscc',
        'name'             => 'name',
        'idNumber'         => 'id_number',
        'signType'         => 'sign_type',
        'signAreaList'     => 'sign_area_list',
    ];

    public function validate()
    {
        Model::validateRequired('organizationName', $this->organizationName, true);
        Model::validateRequired('uscc', $this->uscc, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('signType', $this->signType, true);
        Model::validateRequired('signAreaList', $this->signAreaList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->organizationName) {
            $res['organization_name'] = $this->organizationName;
        }
        if (null !== $this->uscc) {
            $res['uscc'] = $this->uscc;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->signType) {
            $res['sign_type'] = $this->signType;
        }
        if (null !== $this->signAreaList) {
            $res['sign_area_list'] = [];
            if (null !== $this->signAreaList && \is_array($this->signAreaList)) {
                $n = 0;
                foreach ($this->signAreaList as $item) {
                    $res['sign_area_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignEnterpriseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['organization_name'])) {
            $model->organizationName = $map['organization_name'];
        }
        if (isset($map['uscc'])) {
            $model->uscc = $map['uscc'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['sign_type'])) {
            $model->signType = $map['sign_type'];
        }
        if (isset($map['sign_area_list'])) {
            if (!empty($map['sign_area_list'])) {
                $model->signAreaList = [];
                $n                   = 0;
                foreach ($map['sign_area_list'] as $item) {
                    $model->signAreaList[$n++] = null !== $item ? SignatoryInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
