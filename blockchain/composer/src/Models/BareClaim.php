<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BareClaim extends Model
{
    // 下面的内容由调用者自己定义，建议只存放必要的声明信息，不要放置敏感数据
    /**
     * @example {"degree": {"type": "BachelorDegree","name": "Baccalauréat en musiques numériques"}}
     *
     * @var string
     */
    public $claim;

    // 证书类型
    /**
     * @example claimtype
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'claim' => 'claim',
        'type'  => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('claim', $this->claim, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->claim) {
            $res['claim'] = $this->claim;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BareClaim
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['claim'])) {
            $model->claim = $map['claim'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
