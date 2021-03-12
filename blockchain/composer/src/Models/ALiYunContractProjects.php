<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunContractProjects extends Model
{
    // pagination
    /**
     * @example pagination
     *
     * @var ALiYunPagination
     */
    public $pagination;

    // contract_projects
    /**
     * @example contract_projects
     *
     * @var ALiYunContractProject[]
     */
    public $contractProjects;
    protected $_name = [
        'pagination'       => 'pagination',
        'contractProjects' => 'contract_projects',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pagination) {
            $res['pagination'] = null !== $this->pagination ? $this->pagination->toMap() : null;
        }
        if (null !== $this->contractProjects) {
            $res['contract_projects'] = [];
            if (null !== $this->contractProjects && \is_array($this->contractProjects)) {
                $n = 0;
                foreach ($this->contractProjects as $item) {
                    $res['contract_projects'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunContractProjects
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pagination'])) {
            $model->pagination = ALiYunPagination::fromMap($map['pagination']);
        }
        if (isset($map['contract_projects'])) {
            if (!empty($map['contract_projects'])) {
                $model->contractProjects = [];
                $n                       = 0;
                foreach ($map['contract_projects'] as $item) {
                    $model->contractProjects[$n++] = null !== $item ? ALiYunContractProject::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
