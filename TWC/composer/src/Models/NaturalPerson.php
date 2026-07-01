<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class NaturalPerson extends Model
{
    // 自然人姓名
    /**
     * @example 李四
     *
     * @var string
     */
    public $name;

    // 自然人手机号码
    /**
     * @example 13821323232
     *
     * @var string
     */
    public $mobileNumber;

    // 自然人身份号码
    /**
     * @example 412702199812252774
     *
     * @var string
     */
    public $idNumber;

    // 自然人民族
    /**
     * @example 汉
     *
     * @var string
     */
    public $nation;

    // 自然人身份地址
    /**
     * @example 北京市朝阳区XX地址
     *
     * @var string
     */
    public $address;

    // 自然人电子邮箱
    /**
     * @example 323232321@alibba-inc.com
     *
     * @var string
     */
    public $email;

    // 自然人身份证正反面照片
    // 文件信息 列表（先调用接口获取上传url和fileKey）
    /**
     * @example
     *
     * @var FileInfo[]
     */
    public $idNumberFile;
    protected $_name = [
        'name'         => 'name',
        'mobileNumber' => 'mobile_number',
        'idNumber'     => 'id_number',
        'nation'       => 'nation',
        'address'      => 'address',
        'email'        => 'email',
        'idNumberFile' => 'id_number_file',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('mobileNumber', $this->mobileNumber, true);
        Model::validateRequired('idNumber', $this->idNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mobileNumber) {
            $res['mobile_number'] = $this->mobileNumber;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->nation) {
            $res['nation'] = $this->nation;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->idNumberFile) {
            $res['id_number_file'] = [];
            if (null !== $this->idNumberFile && \is_array($this->idNumberFile)) {
                $n = 0;
                foreach ($this->idNumberFile as $item) {
                    $res['id_number_file'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NaturalPerson
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mobile_number'])) {
            $model->mobileNumber = $map['mobile_number'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['nation'])) {
            $model->nation = $map['nation'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['id_number_file'])) {
            if (!empty($map['id_number_file'])) {
                $model->idNumberFile = [];
                $n                   = 0;
                foreach ($map['id_number_file'] as $item) {
                    $model->idNumberFile[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
