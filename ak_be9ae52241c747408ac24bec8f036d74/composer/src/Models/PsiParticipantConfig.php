<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class PsiParticipantConfig extends Model
{
    // 参与方所属节点ID
    /**
     * @example PARTY_test00
     *
     * @var string
     */
    public $partyId;

    // 该参与方用于求交的匹配列，对于线下fate节点不填写该参数，默认匹配其第一列
    /**
     * @example x1
     *
     * @var string
     */
    public $matchedColumn;

    // 参与方输入数据，参考结构体定义
    /**
     * @example
     *
     * @var ParticipantInput
     */
    public $input;

    // 参与方输出数据，参考结构体定义
    /**
     * @example
     *
     * @var ParticipantOutput
     */
    public $output;
    protected $_name = [
        'partyId'       => 'party_id',
        'matchedColumn' => 'matched_column',
        'input'         => 'input',
        'output'        => 'output',
    ];

    public function validate()
    {
        Model::validateRequired('partyId', $this->partyId, true);
        Model::validateRequired('input', $this->input, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }
        if (null !== $this->matchedColumn) {
            $res['matched_column'] = $this->matchedColumn;
        }
        if (null !== $this->input) {
            $res['input'] = null !== $this->input ? $this->input->toMap() : null;
        }
        if (null !== $this->output) {
            $res['output'] = null !== $this->output ? $this->output->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PsiParticipantConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }
        if (isset($map['matched_column'])) {
            $model->matchedColumn = $map['matched_column'];
        }
        if (isset($map['input'])) {
            $model->input = ParticipantInput::fromMap($map['input']);
        }
        if (isset($map['output'])) {
            $model->output = ParticipantOutput::fromMap($map['output']);
        }

        return $model;
    }
}
