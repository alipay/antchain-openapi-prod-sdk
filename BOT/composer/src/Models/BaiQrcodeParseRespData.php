<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiQrcodeParseRespData extends Model
{
    // 二维码内容
    /**
     * @example 1234567890
     *
     * @var string[]
     */
    public $codeValue;
    protected $_name = [
        'codeValue' => 'code_value',
    ];

    public function validate()
    {
        Model::validateRequired('codeValue', $this->codeValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->codeValue) {
            $res['code_value'] = $this->codeValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiQrcodeParseRespData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code_value'])) {
            if (!empty($map['code_value'])) {
                $model->codeValue = $map['code_value'];
            }
        }

        return $model;
    }
}
