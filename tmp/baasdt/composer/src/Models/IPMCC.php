<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPMCC extends Model
{
    // MCC编码
    /**
     * @example 6073
     *
     * @var string
     */
    public $mccCode;

    // 经营类目一级
    /**
     * @example 商业及生活服务
     *
     * @var string
     */
    public $categoryLevel1;

    // 经营类目二级
    /**
     * @example 直销
     *
     * @var string
     */
    public $categoryLevel2;

    // 经营类目三级
    /**
     * @example 目录直销平台
     *
     * @var string
     */
    public $categoryLevel3;
    protected $_name = [
        'mccCode'        => 'mcc_code',
        'categoryLevel1' => 'category_level1',
        'categoryLevel2' => 'category_level2',
        'categoryLevel3' => 'category_level3',
    ];

    public function validate()
    {
        Model::validateRequired('mccCode', $this->mccCode, true);
        Model::validateRequired('categoryLevel1', $this->categoryLevel1, true);
        Model::validateRequired('categoryLevel2', $this->categoryLevel2, true);
        Model::validateRequired('categoryLevel3', $this->categoryLevel3, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mccCode) {
            $res['mcc_code'] = $this->mccCode;
        }
        if (null !== $this->categoryLevel1) {
            $res['category_level1'] = $this->categoryLevel1;
        }
        if (null !== $this->categoryLevel2) {
            $res['category_level2'] = $this->categoryLevel2;
        }
        if (null !== $this->categoryLevel3) {
            $res['category_level3'] = $this->categoryLevel3;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPMCC
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mcc_code'])) {
            $model->mccCode = $map['mcc_code'];
        }
        if (isset($map['category_level1'])) {
            $model->categoryLevel1 = $map['category_level1'];
        }
        if (isset($map['category_level2'])) {
            $model->categoryLevel2 = $map['category_level2'];
        }
        if (isset($map['category_level3'])) {
            $model->categoryLevel3 = $map['category_level3'];
        }

        return $model;
    }
}
