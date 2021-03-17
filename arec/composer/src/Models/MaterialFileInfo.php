<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class MaterialFileInfo extends Model
{
    // 文件路径
    /**
     * @example /root/dd.pdf
     *
     * @var string
     */
    public $filePath;

    // 材料ID，默认值为2，代表身份证明
    /**
     * @example 2
     *
     * @var string
     */
    public $materialId;

    // 材料名称
    /**
     * @example 身份证明
     *
     * @var string
     */
    public $materialName;

    // 材料类型，取值范围：1--申请文件，2--业务表格，3--证照，4--申请人像，5--受理回执单 ，6--缴款通知书，7--抵押登记证明，8--原证照，9--银行内部审批材料，10--网上申办凭证
    /**
     * @example 1
     *
     * @var string
     */
    public $materialType;

    // 材料类别，取值范围：1--原件，2--复印件，3--原件和复印件，4--申请人像，10--原证照
    /**
     * @example 1
     *
     * @var string
     */
    public $materialCategory;

    // 材料份数
    /**
     * @example 1
     *
     * @var int
     */
    public $copiesNumber;

    // 材料页数
    /**
     * @example 2
     *
     * @var int
     */
    public $page;
    protected $_name = [
        'filePath'         => 'file_path',
        'materialId'       => 'material_id',
        'materialName'     => 'material_name',
        'materialType'     => 'material_type',
        'materialCategory' => 'material_category',
        'copiesNumber'     => 'copies_number',
        'page'             => 'page',
    ];

    public function validate()
    {
        Model::validateRequired('filePath', $this->filePath, true);
        Model::validateRequired('materialId', $this->materialId, true);
        Model::validateRequired('materialName', $this->materialName, true);
        Model::validateRequired('copiesNumber', $this->copiesNumber, true);
        Model::validateRequired('page', $this->page, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->materialId) {
            $res['material_id'] = $this->materialId;
        }
        if (null !== $this->materialName) {
            $res['material_name'] = $this->materialName;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
        }
        if (null !== $this->materialCategory) {
            $res['material_category'] = $this->materialCategory;
        }
        if (null !== $this->copiesNumber) {
            $res['copies_number'] = $this->copiesNumber;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MaterialFileInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }
        if (isset($map['material_id'])) {
            $model->materialId = $map['material_id'];
        }
        if (isset($map['material_name'])) {
            $model->materialName = $map['material_name'];
        }
        if (isset($map['material_type'])) {
            $model->materialType = $map['material_type'];
        }
        if (isset($map['material_category'])) {
            $model->materialCategory = $map['material_category'];
        }
        if (isset($map['copies_number'])) {
            $model->copiesNumber = $map['copies_number'];
        }
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }

        return $model;
    }
}
