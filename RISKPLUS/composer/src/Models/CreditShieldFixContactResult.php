<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreditShieldFixContactResult extends Model
{
    // 1-查得，0-未查得
    /**
     * @example 1
     *
     * @var string
     */
    public $result;

    // 查得手机号md5
    /**
     * @example [手机号md5]
     *
     * @var string[]
     */
    public $phones;
    protected $_name = [
        'result' => 'result',
        'phones' => 'phones',
    ];

    public function validate()
    {
        Model::validateRequired('result', $this->result, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->phones) {
            $res['phones'] = $this->phones;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreditShieldFixContactResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['phones'])) {
            if (!empty($map['phones'])) {
                $model->phones = $map['phones'];
            }
        }

        return $model;
    }
}
