<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class DsNameInfo extends Model
{
    // ds_name
    /**
     * @example ds_name
     *
     * @var string
     */
    public $dsName;

    // ds_name_format
    /**
     * @example ds_name_format
     *
     * @var string
     */
    public $dsNameFormat;
    protected $_name = [
        'dsName'       => 'ds_name',
        'dsNameFormat' => 'ds_name_format',
    ];

    public function validate()
    {
        Model::validateRequired('dsName', $this->dsName, true);
        Model::validateRequired('dsNameFormat', $this->dsNameFormat, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dsName) {
            $res['ds_name'] = $this->dsName;
        }
        if (null !== $this->dsNameFormat) {
            $res['ds_name_format'] = $this->dsNameFormat;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DsNameInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ds_name'])) {
            $model->dsName = $map['ds_name'];
        }
        if (isset($map['ds_name_format'])) {
            $model->dsNameFormat = $map['ds_name_format'];
        }

        return $model;
    }
}
