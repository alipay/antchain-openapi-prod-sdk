<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class LcaStageActiveData extends Model
{
    // LCA阶段
    /**
     * @example ProductManufacture
     *
     * @var string
     */
    public $lcaStage;

    // 输入流活动数据列表
    /**
     * @example
     *
     * @var InputStreamActiveData[]
     */
    public $inputStreamList;

    // 输出流活动数据列表
    /**
     * @example
     *
     * @var OutputStreamActiveData[]
     */
    public $outputStreamList;
    protected $_name = [
        'lcaStage'         => 'lca_stage',
        'inputStreamList'  => 'input_stream_list',
        'outputStreamList' => 'output_stream_list',
    ];

    public function validate()
    {
        Model::validateRequired('lcaStage', $this->lcaStage, true);
        Model::validateRequired('inputStreamList', $this->inputStreamList, true);
        Model::validateRequired('outputStreamList', $this->outputStreamList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->lcaStage) {
            $res['lca_stage'] = $this->lcaStage;
        }
        if (null !== $this->inputStreamList) {
            $res['input_stream_list'] = [];
            if (null !== $this->inputStreamList && \is_array($this->inputStreamList)) {
                $n = 0;
                foreach ($this->inputStreamList as $item) {
                    $res['input_stream_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->outputStreamList) {
            $res['output_stream_list'] = [];
            if (null !== $this->outputStreamList && \is_array($this->outputStreamList)) {
                $n = 0;
                foreach ($this->outputStreamList as $item) {
                    $res['output_stream_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LcaStageActiveData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lca_stage'])) {
            $model->lcaStage = $map['lca_stage'];
        }
        if (isset($map['input_stream_list'])) {
            if (!empty($map['input_stream_list'])) {
                $model->inputStreamList = [];
                $n                      = 0;
                foreach ($map['input_stream_list'] as $item) {
                    $model->inputStreamList[$n++] = null !== $item ? InputStreamActiveData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['output_stream_list'])) {
            if (!empty($map['output_stream_list'])) {
                $model->outputStreamList = [];
                $n                       = 0;
                foreach ($map['output_stream_list'] as $item) {
                    $model->outputStreamList[$n++] = null !== $item ? OutputStreamActiveData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
