<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcEnterpriseInfo extends Model
{
    // 企业名称
    /**
     * @example 张三的贸易有限公司
     *
     * @var string
     */
    public $entName;

    // 申请企业证件类型
    /**
     * @example Ent04
     *
     * @var string
     */
    public $entIdType;

    // 客户企业的统一社会信用代码，有企业信息则必输
    /**
     * @example 91234500123400000R
     *
     * @var string
     */
    public $entIdNo;
    protected $_name = [
        'entName'   => 'ent_name',
        'entIdType' => 'ent_id_type',
        'entIdNo'   => 'ent_id_no',
    ];

    public function validate()
    {
        Model::validateRequired('entName', $this->entName, true);
        Model::validateRequired('entIdType', $this->entIdType, true);
        Model::validateRequired('entIdNo', $this->entIdNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->entName) {
            $res['ent_name'] = $this->entName;
        }
        if (null !== $this->entIdType) {
            $res['ent_id_type'] = $this->entIdType;
        }
        if (null !== $this->entIdNo) {
            $res['ent_id_no'] = $this->entIdNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcEnterpriseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ent_name'])) {
            $model->entName = $map['ent_name'];
        }
        if (isset($map['ent_id_type'])) {
            $model->entIdType = $map['ent_id_type'];
        }
        if (isset($map['ent_id_no'])) {
            $model->entIdNo = $map['ent_id_no'];
        }

        return $model;
    }
}
