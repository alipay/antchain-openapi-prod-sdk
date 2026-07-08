<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class TransferPathAnalysis extends Model
{
    // 所属领域
    /**
     * @example 系统能效提升
     *
     * @var string
     */
    public $field;

    // 目录编号
    /**
     * @example 1.12
     *
     * @var string
     */
    public $indexNumber;

    // 目录内容
    /**
     * @example 低温余热有机工质郎肯循环（ORC）发电
     *
     * @var string
     */
    public $indexContent;

    // 技术标准说明
    /**
     * @example 基于有机朗肯循环（ORC）原理，通过蒸发器回收95-300℃的热水、热液、蒸汽、烟气中的低温余热，通过向心涡轮和发电机将热量转换成高品质电能。参考标准《低温余热双循环发电装置》（GB/T 37819-2019）、《低温双循环余热回收利用装置性能测试方法》（GB/T 40286-2021）等。
     *
     * @var string
     */
    public $detail;

    // 企业是否采取该路径
    /**
     * @example 长期目标
     *
     * @var string
     */
    public $target;
    protected $_name = [
        'field'        => 'field',
        'indexNumber'  => 'index_number',
        'indexContent' => 'index_content',
        'detail'       => 'detail',
        'target'       => 'target',
    ];

    public function validate()
    {
        Model::validateRequired('field', $this->field, true);
        Model::validateRequired('indexNumber', $this->indexNumber, true);
        Model::validateRequired('indexContent', $this->indexContent, true);
        Model::validateRequired('detail', $this->detail, true);
        Model::validateRequired('target', $this->target, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->field) {
            $res['field'] = $this->field;
        }
        if (null !== $this->indexNumber) {
            $res['index_number'] = $this->indexNumber;
        }
        if (null !== $this->indexContent) {
            $res['index_content'] = $this->indexContent;
        }
        if (null !== $this->detail) {
            $res['detail'] = $this->detail;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransferPathAnalysis
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['field'])) {
            $model->field = $map['field'];
        }
        if (isset($map['index_number'])) {
            $model->indexNumber = $map['index_number'];
        }
        if (isset($map['index_content'])) {
            $model->indexContent = $map['index_content'];
        }
        if (isset($map['detail'])) {
            $model->detail = $map['detail'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }

        return $model;
    }
}
