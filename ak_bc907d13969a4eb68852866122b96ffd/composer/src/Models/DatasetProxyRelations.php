<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class DatasetProxyRelations extends Model
{
    // 来源
    /**
     * @example ITAG
     *
     * @var string
     */
    public $source;

    // iTAG数据集的ID
    /**
     * @example 1501755816871657472
     *
     * @var string
     */
    public $datasetid;

    // 标注类型
    /**
     * @example LABEL
     *
     * @var string
     */
    public $datasettype;

    // SourceBizId
    /**
     * @example SourceBizId
     *
     * @var string
     */
    public $sourcebizid;
    protected $_name = [
        'source'      => 'source',
        'datasetid'   => 'datasetid',
        'datasettype' => 'datasettype',
        'sourcebizid' => 'sourcebizid',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->datasetid) {
            $res['datasetid'] = $this->datasetid;
        }
        if (null !== $this->datasettype) {
            $res['datasettype'] = $this->datasettype;
        }
        if (null !== $this->sourcebizid) {
            $res['sourcebizid'] = $this->sourcebizid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DatasetProxyRelations
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['datasetid'])) {
            $model->datasetid = $map['datasetid'];
        }
        if (isset($map['datasettype'])) {
            $model->datasettype = $map['datasettype'];
        }
        if (isset($map['sourcebizid'])) {
            $model->sourcebizid = $map['sourcebizid'];
        }

        return $model;
    }
}
