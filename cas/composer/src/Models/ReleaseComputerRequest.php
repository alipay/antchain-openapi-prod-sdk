<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ReleaseComputerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 需要释放的 computer ids
    /**
     * @var string[]
     */
    public $computerSequences;
    protected $_name = [
        'authToken'         => 'auth_token',
        'computerSequences' => 'computer_sequences',
    ];

    public function validate()
    {
        Model::validateRequired('computerSequences', $this->computerSequences, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->computerSequences) {
            $res['computer_sequences'] = $this->computerSequences;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReleaseComputerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['computer_sequences'])) {
            if (!empty($map['computer_sequences'])) {
                $model->computerSequences = $map['computer_sequences'];
            }
        }

        return $model;
    }
}
