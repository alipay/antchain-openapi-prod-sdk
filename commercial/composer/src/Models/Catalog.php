<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class Catalog extends Model
{
    // 类目id
    /**
     * @example
     *
     * @var int
     */
    public $catalogId;

    // 类目名称
    /**
     * @example 企业及应用服务
     *
     * @var string
     */
    public $catalogName;
    protected $_name = [
        'catalogId'   => 'catalog_id',
        'catalogName' => 'catalog_name',
    ];

    public function validate()
    {
        Model::validateRequired('catalogId', $this->catalogId, true);
        Model::validateRequired('catalogName', $this->catalogName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->catalogId) {
            $res['catalog_id'] = $this->catalogId;
        }
        if (null !== $this->catalogName) {
            $res['catalog_name'] = $this->catalogName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Catalog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['catalog_id'])) {
            $model->catalogId = $map['catalog_id'];
        }
        if (isset($map['catalog_name'])) {
            $model->catalogName = $map['catalog_name'];
        }

        return $model;
    }
}
