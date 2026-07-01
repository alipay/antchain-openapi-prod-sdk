<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LegalPerson extends Model
{
    // 被申请人姓名
    /**
     * @example 李四
     *
     * @var string
     */
    public $name;

    // 法人统一社会信用编码
    /**
     * @example 412702199812252774
     *
     * @var string
     */
    public $idNumber;

    // 法定代表人姓名
    /**
     * @example 李四
     *
     * @var string
     */
    public $representativeName;

    // 联系方式
    /**
     * @example 13812123232
     *
     * @var string
     */
    public $legalPhoneNumber;

    // 住所地（同营业执照地址）
    /**
     * @example 北京市朝阳区XX地址
     *
     * @var string
     */
    public $legalAddress;

    // 企业经营地址
    /**
     * @example 北京市朝阳区XX地址
     *
     * @var string
     */
    public $legalBusinessAddress;

    // 营业执照照片
    // 文件信息列表（先调用接口获取上传url和fileKey）
    /**
     * @example
     *
     * @var FileInfo[]
     */
    public $legalIdNumberFile;
    protected $_name = [
        'name'                 => 'name',
        'idNumber'             => 'id_number',
        'representativeName'   => 'representative_name',
        'legalPhoneNumber'     => 'legal_phone_number',
        'legalAddress'         => 'legal_address',
        'legalBusinessAddress' => 'legal_business_address',
        'legalIdNumberFile'    => 'legal_id_number_file',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('idNumber', $this->idNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->representativeName) {
            $res['representative_name'] = $this->representativeName;
        }
        if (null !== $this->legalPhoneNumber) {
            $res['legal_phone_number'] = $this->legalPhoneNumber;
        }
        if (null !== $this->legalAddress) {
            $res['legal_address'] = $this->legalAddress;
        }
        if (null !== $this->legalBusinessAddress) {
            $res['legal_business_address'] = $this->legalBusinessAddress;
        }
        if (null !== $this->legalIdNumberFile) {
            $res['legal_id_number_file'] = [];
            if (null !== $this->legalIdNumberFile && \is_array($this->legalIdNumberFile)) {
                $n = 0;
                foreach ($this->legalIdNumberFile as $item) {
                    $res['legal_id_number_file'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LegalPerson
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['representative_name'])) {
            $model->representativeName = $map['representative_name'];
        }
        if (isset($map['legal_phone_number'])) {
            $model->legalPhoneNumber = $map['legal_phone_number'];
        }
        if (isset($map['legal_address'])) {
            $model->legalAddress = $map['legal_address'];
        }
        if (isset($map['legal_business_address'])) {
            $model->legalBusinessAddress = $map['legal_business_address'];
        }
        if (isset($map['legal_id_number_file'])) {
            if (!empty($map['legal_id_number_file'])) {
                $model->legalIdNumberFile = [];
                $n                        = 0;
                foreach ($map['legal_id_number_file'] as $item) {
                    $model->legalIdNumberFile[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
