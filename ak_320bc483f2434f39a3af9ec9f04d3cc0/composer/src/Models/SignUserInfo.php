<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class SignUserInfo extends Model
{
    // 身份证号
    /**
     * @example 220***************
     *
     * @var string
     */
    public $idNumber;

    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 签署区列表
    /**
     * @example -
     *
     * @var SignatoryInfo[]
     */
    public $signAreaList;
    protected $_name = [
        'idNumber'     => 'id_number',
        'name'         => 'name',
        'signAreaList' => 'sign_area_list',
    ];

    public function validate()
    {
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('signAreaList', $this->signAreaList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
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
     * @return SignUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
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
