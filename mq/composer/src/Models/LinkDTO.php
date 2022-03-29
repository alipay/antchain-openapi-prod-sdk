<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class LinkDTO extends Model
{
    // demo工程
    /**
     * @example https://help.aliyun.com/document_detail/146986.html
     *
     * @var string
     */
    public $demoProject;

    // 产品文档
    /**
     * @example https://help.aliyun.com/document_detail/146936.html
     *
     * @var string
     */
    public $productDoc;

    // 快速开始文档
    /**
     * @example https://help.aliyun.com/document_detail/147580.html
     *
     * @var string
     */
    public $quickStart;
    protected $_name = [
        'demoProject' => 'demo_project',
        'productDoc'  => 'product_doc',
        'quickStart'  => 'quick_start',
    ];

    public function validate()
    {
        Model::validateRequired('demoProject', $this->demoProject, true);
        Model::validateRequired('productDoc', $this->productDoc, true);
        Model::validateRequired('quickStart', $this->quickStart, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->demoProject) {
            $res['demo_project'] = $this->demoProject;
        }
        if (null !== $this->productDoc) {
            $res['product_doc'] = $this->productDoc;
        }
        if (null !== $this->quickStart) {
            $res['quick_start'] = $this->quickStart;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LinkDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['demo_project'])) {
            $model->demoProject = $map['demo_project'];
        }
        if (isset($map['product_doc'])) {
            $model->productDoc = $map['product_doc'];
        }
        if (isset($map['quick_start'])) {
            $model->quickStart = $map['quick_start'];
        }

        return $model;
    }
}
