<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class AutoCodeModel extends Model
{
    // 111
    /**
     * @example 111
     *
     * @var string
     */
    public $modelStringParam;

    // 111
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modelDateParam;

    // 111
    /**
     * @example 111
     *
     * @var string[]
     */
    public $modelArrayParam;
    protected $_name = [
        'modelStringParam' => 'model_string_param',
        'modelDateParam'   => 'model_date_param',
        'modelArrayParam'  => 'model_array_param',
    ];

    public function validate()
    {
        Model::validateRequired('modelStringParam', $this->modelStringParam, true);
        Model::validateRequired('modelDateParam', $this->modelDateParam, true);
        Model::validateRequired('modelArrayParam', $this->modelArrayParam, true);
        Model::validatePattern('modelDateParam', $this->modelDateParam, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->modelStringParam) {
            $res['model_string_param'] = $this->modelStringParam;
        }
        if (null !== $this->modelDateParam) {
            $res['model_date_param'] = $this->modelDateParam;
        }
        if (null !== $this->modelArrayParam) {
            $res['model_array_param'] = $this->modelArrayParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AutoCodeModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['model_string_param'])) {
            $model->modelStringParam = $map['model_string_param'];
        }
        if (isset($map['model_date_param'])) {
            $model->modelDateParam = $map['model_date_param'];
        }
        if (isset($map['model_array_param'])) {
            if (!empty($map['model_array_param'])) {
                $model->modelArrayParam = $map['model_array_param'];
            }
        }

        return $model;
    }
}
